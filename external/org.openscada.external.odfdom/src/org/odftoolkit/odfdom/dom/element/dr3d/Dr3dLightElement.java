/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.dr3d;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dDiffuseColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dDirectionAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dEnabledAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dSpecularAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element dr3d:light}.
 *
 */
public class Dr3dLightElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DR3D, "light");

	/**
	 * Create the instance of <code>Dr3dLightElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public Dr3dLightElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element dr3d:light}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dDiffuseColorAttribute</code> , See {@odf.attribute dr3d:diffuse-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dDiffuseColorAttribute() {
		Dr3dDiffuseColorAttribute attr = (Dr3dDiffuseColorAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "diffuse-color");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dDiffuseColorAttribute</code> , See {@odf.attribute dr3d:diffuse-color}
	 *
	 * @param dr3dDiffuseColorValue   The type is <code>String</code>
	 */
	public void setDr3dDiffuseColorAttribute(String dr3dDiffuseColorValue) {
		Dr3dDiffuseColorAttribute attr = new Dr3dDiffuseColorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dDiffuseColorValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dDirectionAttribute</code> , See {@odf.attribute dr3d:direction}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dDirectionAttribute() {
		Dr3dDirectionAttribute attr = (Dr3dDirectionAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "direction");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dDirectionAttribute</code> , See {@odf.attribute dr3d:direction}
	 *
	 * @param dr3dDirectionValue   The type is <code>String</code>
	 */
	public void setDr3dDirectionAttribute(String dr3dDirectionValue) {
		Dr3dDirectionAttribute attr = new Dr3dDirectionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dDirectionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dEnabledAttribute</code> , See {@odf.attribute dr3d:enabled}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDr3dEnabledAttribute() {
		Dr3dEnabledAttribute attr = (Dr3dEnabledAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "enabled");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dEnabledAttribute</code> , See {@odf.attribute dr3d:enabled}
	 *
	 * @param dr3dEnabledValue   The type is <code>Boolean</code>
	 */
	public void setDr3dEnabledAttribute(Boolean dr3dEnabledValue) {
		Dr3dEnabledAttribute attr = new Dr3dEnabledAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(dr3dEnabledValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dSpecularAttribute</code> , See {@odf.attribute dr3d:specular}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDr3dSpecularAttribute() {
		Dr3dSpecularAttribute attr = (Dr3dSpecularAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "specular");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dSpecularAttribute</code> , See {@odf.attribute dr3d:specular}
	 *
	 * @param dr3dSpecularValue   The type is <code>Boolean</code>
	 */
	public void setDr3dSpecularAttribute(Boolean dr3dSpecularValue) {
		Dr3dSpecularAttribute attr = new Dr3dSpecularAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(dr3dSpecularValue.booleanValue());
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
