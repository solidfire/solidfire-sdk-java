/*
 * Copyright &copy 2014-2016 NetApp, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * DO NOT EDIT THIS CODE BY HAND! It has been generated with jsvcgen.
 */
package com.solidfire.element.api;

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.text.MessageFormat;

public class AuthConfigType implements Serializable{
	/**
	*AuthConfigType 
	*This type indicates the configuration data which will be accessed or modified by the element auth container.
	**/
	 public static ArrayList<String> enumValues = new ArrayList<String>();
	 private String value;
	 {
		enumValues.add("mNode"); 
		 		enumValues.add("element"); 
		 	

         }	 
	
	 public AuthConfigType(String inValue){
	     if(!enumValues.contains(inValue)){
	     System.out.println("AuthConfigType " + "value=" + inValue + "enum_values=" + enumValues);
	     }
	     this.value=inValue;
	}
	 private String restr(){
	 return String.valueOf(this.value);
	 }


	 public String getValue(){
	 return (this.value);
	 }
}

