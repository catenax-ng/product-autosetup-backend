/********************************************************************************
 * Copyright (c) 2022, 2023 T-Systems International GmbH
 * Copyright (c) 2022, 2023 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ********************************************************************************/

package org.eclipse.tractusx.autosetup.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerProperties {

	@NotBlank(message = "bpnNumber is mandatory")
	@Pattern(regexp = "[a-zA-Z0-9\\_\\-]+",
    message = "bpnNumber should not contains special characters")
	private String bpnNumber;
	
	@NotBlank(message = "SubscriptionId is mandatory")
	@Pattern(regexp = "[a-zA-Z0-9\\_\\-]+",
    message = "SubscriptionId should not contains special characters")
	private String subscriptionId;
	
	@NotBlank(message = "ServiceId is mandatory")
	@Pattern(regexp = "[a-zA-Z0-9\\_\\-]+",
    message = "ServiceId should not contains special characters")
	private String serviceId;
	
	
	private String role;
}
