package com.solidfire

import java.io.File

import com.typesafe.config.ConfigFactory

object Configuration {
  private val config = ConfigFactory.parseFile( new File( "dev-test-resource.properties" ) )
  private def getAtPathOrSystemAsDefault( path: String ): String = {
    if (config.hasPath( path )) config.getString( path ) else System.getProperty( path )
  }

  def host = getAtPathOrSystemAsDefault( "integration.host" )

  def port = getAtPathOrSystemAsDefault( "integration.port" )

  def username = getAtPathOrSystemAsDefault( "integration.username" )

  def password = getAtPathOrSystemAsDefault( "integration.password" )

}