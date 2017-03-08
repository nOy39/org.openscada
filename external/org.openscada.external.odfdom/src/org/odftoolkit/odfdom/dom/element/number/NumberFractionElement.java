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
package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.number.NumberDenominatorValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberGroupingAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinDenominatorDigitsAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinIntegerDigitsAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinNumeratorDigitsAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element number:fraction}.
 *
 */
public class NumberFractionElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.NUMBER, "fraction");

	/**
	 * Create the instance of <code>NumberFractionElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public NumberFractionElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element number:fraction}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberDenominatorValueAttribute</code> , See {@odf.attribute number:denominator-value}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberDenominatorValueAttribute() {
		NumberDenominatorValueAttribute attr = (NumberDenominatorValueAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "denominator-value");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberDenominatorValueAttribute</code> , See {@odf.attribute number:denominator-value}
	 *
	 * @param numberDenominatorValueValue   The type is <code>Integer</code>
	 */
	public void setNumberDenominatorValueAttribute(Integer numberDenominatorValueValue) {
		NumberDenominatorValueAttribute attr = new NumberDenominatorValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberDenominatorValueValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberGroupingAttribute</code> , See {@odf.attribute number:grouping}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getNumberGroupingAttribute() {
		NumberGroupingAttribute attr = (NumberGroupingAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "grouping");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(NumberGroupingAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberGroupingAttribute</code> , See {@odf.attribute number:grouping}
	 *
	 * @param numberGroupingValue   The type is <code>Boolean</code>
	 */
	public void setNumberGroupingAttribute(Boolean numberGroupingValue) {
		NumberGroupingAttribute attr = new NumberGroupingAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(numberGroupingValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberMinDenominatorDigitsAttribute</code> , See {@odf.attribute number:min-denominator-digits}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberMinDenominatorDigitsAttribute() {
		NumberMinDenominatorDigitsAttribute attr = (NumberMinDenominatorDigitsAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "min-denominator-digits");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberMinDenominatorDigitsAttribute</code> , See {@odf.attribute number:min-denominator-digits}
	 *
	 * @param numberMinDenominatorDigitsValue   The type is <code>Integer</code>
	 */
	public void setNumberMinDenominatorDigitsAttribute(Integer numberMinDenominatorDigitsValue) {
		NumberMinDenominatorDigitsAttribute attr = new NumberMinDenominatorDigitsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberMinDenominatorDigitsValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberMinIntegerDigitsAttribute</code> , See {@odf.attribute number:min-integer-digits}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberMinIntegerDigitsAttribute() {
		NumberMinIntegerDigitsAttribute attr = (NumberMinIntegerDigitsAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "min-integer-digits");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberMinIntegerDigitsAttribute</code> , See {@odf.attribute number:min-integer-digits}
	 *
	 * @param numberMinIntegerDigitsValue   The type is <code>Integer</code>
	 */
	public void setNumberMinIntegerDigitsAttribute(Integer numberMinIntegerDigitsValue) {
		NumberMinIntegerDigitsAttribute attr = new NumberMinIntegerDigitsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberMinIntegerDigitsValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberMinNumeratorDigitsAttribute</code> , See {@odf.attribute number:min-numerator-digits}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberMinNumeratorDigitsAttribute() {
		NumberMinNumeratorDigitsAttribute attr = (NumberMinNumeratorDigitsAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "min-numerator-digits");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberMinNumeratorDigitsAttribute</code> , See {@odf.attribute number:min-numerator-digits}
	 *
	 * @param numberMinNumeratorDigitsValue   The type is <code>Integer</code>
	 */
	public void setNumberMinNumeratorDigitsAttribute(Integer numberMinNumeratorDigitsValue) {
		NumberMinNumeratorDigitsAttribute attr = new NumberMinNumeratorDigitsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberMinNumeratorDigitsValue.intValue());
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
