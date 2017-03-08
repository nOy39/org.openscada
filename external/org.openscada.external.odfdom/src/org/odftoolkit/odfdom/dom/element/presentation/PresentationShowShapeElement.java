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
package org.odftoolkit.odfdom.dom.element.presentation;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawShapeIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationDelayAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationDirectionAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationEffectAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPathIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationSpeedAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationStartScaleAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element presentation:show-shape}.
 *
 */
public class PresentationShowShapeElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.PRESENTATION, "show-shape");

	/**
	 * Create the instance of <code>PresentationShowShapeElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public PresentationShowShapeElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element presentation:show-shape}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawShapeIdAttribute</code> , See {@odf.attribute draw:shape-id}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawShapeIdAttribute() {
		DrawShapeIdAttribute attr = (DrawShapeIdAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "shape-id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawShapeIdAttribute</code> , See {@odf.attribute draw:shape-id}
	 *
	 * @param drawShapeIdValue   The type is <code>String</code>
	 */
	public void setDrawShapeIdAttribute(String drawShapeIdValue) {
		DrawShapeIdAttribute attr = new DrawShapeIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawShapeIdValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationDelayAttribute</code> , See {@odf.attribute presentation:delay}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationDelayAttribute() {
		PresentationDelayAttribute attr = (PresentationDelayAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "delay");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationDelayAttribute</code> , See {@odf.attribute presentation:delay}
	 *
	 * @param presentationDelayValue   The type is <code>String</code>
	 */
	public void setPresentationDelayAttribute(String presentationDelayValue) {
		PresentationDelayAttribute attr = new PresentationDelayAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationDelayValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationDirectionAttribute</code> , See {@odf.attribute presentation:direction}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationDirectionAttribute() {
		PresentationDirectionAttribute attr = (PresentationDirectionAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "direction");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return PresentationDirectionAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationDirectionAttribute</code> , See {@odf.attribute presentation:direction}
	 *
	 * @param presentationDirectionValue   The type is <code>String</code>
	 */
	public void setPresentationDirectionAttribute(String presentationDirectionValue) {
		PresentationDirectionAttribute attr = new PresentationDirectionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationDirectionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationEffectAttribute</code> , See {@odf.attribute presentation:effect}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationEffectAttribute() {
		PresentationEffectAttribute attr = (PresentationEffectAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "effect");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return PresentationEffectAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationEffectAttribute</code> , See {@odf.attribute presentation:effect}
	 *
	 * @param presentationEffectValue   The type is <code>String</code>
	 */
	public void setPresentationEffectAttribute(String presentationEffectValue) {
		PresentationEffectAttribute attr = new PresentationEffectAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationEffectValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPathIdAttribute</code> , See {@odf.attribute presentation:path-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPathIdAttribute() {
		PresentationPathIdAttribute attr = (PresentationPathIdAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "path-id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPathIdAttribute</code> , See {@odf.attribute presentation:path-id}
	 *
	 * @param presentationPathIdValue   The type is <code>String</code>
	 */
	public void setPresentationPathIdAttribute(String presentationPathIdValue) {
		PresentationPathIdAttribute attr = new PresentationPathIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationPathIdValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationSpeedAttribute</code> , See {@odf.attribute presentation:speed}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationSpeedAttribute() {
		PresentationSpeedAttribute attr = (PresentationSpeedAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "speed");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return PresentationSpeedAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationSpeedAttribute</code> , See {@odf.attribute presentation:speed}
	 *
	 * @param presentationSpeedValue   The type is <code>String</code>
	 */
	public void setPresentationSpeedAttribute(String presentationSpeedValue) {
		PresentationSpeedAttribute attr = new PresentationSpeedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationSpeedValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationStartScaleAttribute</code> , See {@odf.attribute presentation:start-scale}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationStartScaleAttribute() {
		PresentationStartScaleAttribute attr = (PresentationStartScaleAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "start-scale");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return PresentationStartScaleAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationStartScaleAttribute</code> , See {@odf.attribute presentation:start-scale}
	 *
	 * @param presentationStartScaleValue   The type is <code>String</code>
	 */
	public void setPresentationStartScaleAttribute(String presentationStartScaleValue) {
		PresentationStartScaleAttribute attr = new PresentationStartScaleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationStartScaleValue);
	}

	/**
	 * Create child element {@odf.element presentation:sound}.
	 *
	 * @param xlinkHrefValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * @return the element {@odf.element presentation:sound}
	 */
	 public PresentationSoundElement newPresentationSoundElement(String xlinkHrefValue, String xlinkTypeValue) {
		PresentationSoundElement presentationSound = ((OdfFileDom) this.ownerDocument).newOdfElement(PresentationSoundElement.class);
		presentationSound.setXlinkHrefAttribute(xlinkHrefValue);
		presentationSound.setXlinkTypeAttribute(xlinkTypeValue);
		this.appendChild(presentationSound);
		return presentationSound;
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
