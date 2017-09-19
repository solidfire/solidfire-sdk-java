package com.solidfire.api

import com.solidfire.adaptor.ElementServiceAdaptor._
import com.solidfire.core.client.Attributes
import com.solidfire.core.javautil.Optional
import com.solidfire.element.api._
import com.solidfire.util.Utility
import org.mockito.Matchers._
import org.mockito.Mockito.when
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

class InvokeSFApiTest extends WordSpec with BeforeAndAfterAll with MockitoSugar with Matchers {

  val sfe = mock[SolidFireElement]

  "invokeSFApi" should {
    "throw IllegalArgumentException when SolidFireElement is null" in {
      the[IllegalArgumentException] thrownBy {
        invokeSFApi( null, null )
      } should have message "SolidFireElement was null"
    }
    "throw IllegalArgumentException when request is null" in {
      the[IllegalArgumentException] thrownBy {
        invokeSFApi( sfe, null )
      } should have message "InvokeSFApiRequest was null"
    }
    "throw IllegalArgumentException when request.method is null" in {
      the[IllegalArgumentException] thrownBy {
        val request = new InvokeSFApiRequest(null, null)
        invokeSFApi( sfe, request )
      } should have message "InvokeSFApiRequest GetMethod was null"
    }

    "GetAPI via InvokeSFApi" in {
      val request = new InvokeSFApiRequest("GetAPI", null)

      val returned = Utility.getResultFromResource[Object]("GetAPI_v7.json")

      when( sfe.sendRequest( org.mockito.Matchers.eq("GetAPI"), any(), any() ,any())  ).thenReturn( returned )

      val result = invokeSFApi(sfe, request)
      result.get("7.0") should not be null
    }

    "GetConfig via InvokeSFApi" in {
      val request = new InvokeSFApiRequest("GetConfig", null)

      val returned = Utility.getResultFromResource[Object]("GetConfig_v8.json")

      when( sfe.sendRequest( org.mockito.Matchers.eq("GetConfig"), any(), any() ,any())  ).thenReturn( returned )

      val result = invokeSFApi(sfe, request)
      result.get("config") should not be null
    }

    "ListAccounts via InvokeSFApi" in {
      val listAccountsRequest = new ListAccountsRequest()
      listAccountsRequest.asBuilder().build()
      val request = new InvokeSFApiRequest("ListAccounts", Optional.of(new Attributes(listAccountsRequest.toMap())))
      val returned = Utility.getResultFromResource[Object]("ListAccounts_v8.json")

      when( sfe.sendRequest( org.mockito.Matchers.eq("ListAccounts"), org.mockito.Matchers.eq(Optional.of(listAccountsRequest.toMap())), any() ,any())  ).thenReturn( returned )

      val result = invokeSFApi(sfe, request)
      result.get("accounts") should not be null
    }
  }
}
