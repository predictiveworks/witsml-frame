package de.kp.works.witsml
/*
 * Copyright (c) 20129 - 2021 Dr. Krusche & Partner PartG. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * @author Stefan Krusche, Dr. Krusche & Partner PartG
 *
 */

import com.hashmapinc.tempus.witsml.api.WitsmlVersion

class WitsmlObjects1411(
   /* Specifies the witsml.tcp address of the witsml server */
   endpoint:String,
   /* Specifies the username for Witsml Server */
   username:String,
   /* Specify the password for Witsml Server */
   password:String) extends WitsmlObjects(endpoint, username, password, WitsmlVersion.VERSION_1411) {

}
