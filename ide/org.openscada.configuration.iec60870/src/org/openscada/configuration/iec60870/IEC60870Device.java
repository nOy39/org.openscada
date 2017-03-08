/**
 * Copyright (c) 2014, 2016 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 *
 */
package org.openscada.configuration.iec60870;

import org.eclipse.scada.configuration.infrastructure.Device;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openscada.configuration.iec60870.IEC60870Device#getDataModuleOptions <em>Data Module Options</em>}</li>
 *   <li>{@link org.openscada.configuration.iec60870.IEC60870Device#getProtocolOptions <em>Protocol Options</em>}</li>
 *   <li>{@link org.openscada.configuration.iec60870.IEC60870Device#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.openscada.configuration.iec60870.IEC60870Package#getIEC60870Device()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='portCheck'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL portCheck='port > 0 and port < 65535'"
 * @generated
 */
public interface IEC60870Device extends Device
{
    /**
     * Returns the value of the '<em><b>Data Module Options</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Module Options</em>' containment
     * reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Module Options</em>' containment reference.
     * @see #setDataModuleOptions(ClientDataModuleOptions)
     * @see org.openscada.configuration.iec60870.IEC60870Package#getIEC60870Device_DataModuleOptions()
     * @model containment="true"
     * @generated
     */
    ClientDataModuleOptions getDataModuleOptions ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.iec60870.IEC60870Device#getDataModuleOptions <em>Data Module Options</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Module Options</em>' containment reference.
     * @see #getDataModuleOptions()
     * @generated
     */
    void setDataModuleOptions ( ClientDataModuleOptions value );

    /**
     * Returns the value of the '<em><b>Protocol Options</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protocol Options</em>' containment reference
     * isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protocol Options</em>' containment reference.
     * @see #setProtocolOptions(ProtocolOptions)
     * @see org.openscada.configuration.iec60870.IEC60870Package#getIEC60870Device_ProtocolOptions()
     * @model containment="true"
     * @generated
     */
    ProtocolOptions getProtocolOptions ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.iec60870.IEC60870Device#getProtocolOptions <em>Protocol Options</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protocol Options</em>' containment reference.
     * @see #getProtocolOptions()
     * @generated
     */
    void setProtocolOptions ( ProtocolOptions value );

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * The default value is <code>"2404"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(int)
     * @see org.openscada.configuration.iec60870.IEC60870Package#getIEC60870Device_Port()
     * @model default="2404" required="true"
     * @generated
     */
    int getPort ();

    /**
     * Sets the value of the '{@link org.openscada.configuration.iec60870.IEC60870Device#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort ( int value );

} // IEC60870Device
