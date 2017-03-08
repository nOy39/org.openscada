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
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginLeftAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoTextIndentAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextLabelFollowedByAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextListTabStopPositionAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:list-level-label-alignment}.
 *
 */
public class StyleListLevelLabelAlignmentElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "list-level-label-alignment");

	/**
	 * Create the instance of <code>StyleListLevelLabelAlignmentElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleListLevelLabelAlignmentElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:list-level-label-alignment}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoMarginLeftAttribute</code> , See {@odf.attribute fo:margin-left}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoMarginLeftAttribute() {
		FoMarginLeftAttribute attr = (FoMarginLeftAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "margin-left");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FoMarginLeftAttribute</code> , See {@odf.attribute fo:margin-left}
	 *
	 * @param foMarginLeftValue   The type is <code>String</code>
	 */
	public void setFoMarginLeftAttribute(String foMarginLeftValue) {
		FoMarginLeftAttribute attr = new FoMarginLeftAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(foMarginLeftValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoTextIndentAttribute</code> , See {@odf.attribute fo:text-indent}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoTextIndentAttribute() {
		FoTextIndentAttribute attr = (FoTextIndentAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "text-indent");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FoTextIndentAttribute</code> , See {@odf.attribute fo:text-indent}
	 *
	 * @param foTextIndentValue   The type is <code>String</code>
	 */
	public void setFoTextIndentAttribute(String foTextIndentValue) {
		FoTextIndentAttribute attr = new FoTextIndentAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(foTextIndentValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextLabelFollowedByAttribute</code> , See {@odf.attribute text:label-followed-by}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextLabelFollowedByAttribute() {
		TextLabelFollowedByAttribute attr = (TextLabelFollowedByAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "label-followed-by");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextLabelFollowedByAttribute</code> , See {@odf.attribute text:label-followed-by}
	 *
	 * @param textLabelFollowedByValue   The type is <code>String</code>
	 */
	public void setTextLabelFollowedByAttribute(String textLabelFollowedByValue) {
		TextLabelFollowedByAttribute attr = new TextLabelFollowedByAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textLabelFollowedByValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextListTabStopPositionAttribute</code> , See {@odf.attribute text:list-tab-stop-position}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextListTabStopPositionAttribute() {
		TextListTabStopPositionAttribute attr = (TextListTabStopPositionAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "list-tab-stop-position");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextListTabStopPositionAttribute</code> , See {@odf.attribute text:list-tab-stop-position}
	 *
	 * @param textListTabStopPositionValue   The type is <code>String</code>
	 */
	public void setTextListTabStopPositionAttribute(String textListTabStopPositionValue) {
		TextListTabStopPositionAttribute attr = new TextListTabStopPositionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textListTabStopPositionValue);
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
