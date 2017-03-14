/**
 * Copyright (c) 2015 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.openscada.configuration.opcxml.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.scada.configuration.infrastructure.Configurations;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.infrastructure.Node;
import org.eclipse.scada.configuration.infrastructure.SystemNode;

import org.eclipse.scada.configuration.infrastructure.util.InfrastructureSwitch;

import org.eclipse.scada.configuration.world.ApplicationNode;
import org.eclipse.scada.configuration.world.WorldPackage;
import org.eclipse.scada.configuration.world.util.WorldSwitch;
import org.openscada.configuration.opcxml.OpcxmlFactory;
import org.openscada.configuration.opcxml.OpcxmlPackage;

import org.openscada.configuration.opcxml.util.OpcxmlAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcxmlItemProviderAdapterFactory extends OpcxmlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This helps manage the child creation extenders.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(OpcxmlEditPlugin.INSTANCE, OpcxmlPackage.eNS_URI);

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpcxmlItemProviderAdapterFactory()
    {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.OpcXmlDevice} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcXmlDeviceItemProvider opcXmlDeviceItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.OpcXmlDevice}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createOpcXmlDeviceAdapter()
    {
        if (opcXmlDeviceItemProvider == null)
        {
            opcXmlDeviceItemProvider = new OpcXmlDeviceItemProvider(this);
        }

        return opcXmlDeviceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.OpcXmlDriver} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpcXmlDriverItemProvider opcXmlDriverItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.OpcXmlDriver}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createOpcXmlDriverAdapter()
    {
        if (opcXmlDriverItemProvider == null)
        {
            opcXmlDriverItemProvider = new OpcXmlDriverItemProvider(this);
        }

        return opcXmlDriverItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.DriverApplication} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DriverApplicationItemProvider driverApplicationItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.DriverApplication}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDriverApplicationAdapter()
    {
        if (driverApplicationItemProvider == null)
        {
            driverApplicationItemProvider = new DriverApplicationItemProvider(this);
        }

        return driverApplicationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.HiveDevice} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HiveDeviceItemProvider hiveDeviceItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.HiveDevice}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createHiveDeviceAdapter()
    {
        if (hiveDeviceItemProvider == null)
        {
            hiveDeviceItemProvider = new HiveDeviceItemProvider(this);
        }

        return hiveDeviceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.UrlWsdlSource} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UrlWsdlSourceItemProvider urlWsdlSourceItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.UrlWsdlSource}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createUrlWsdlSourceAdapter()
    {
        if (urlWsdlSourceItemProvider == null)
        {
            urlWsdlSourceItemProvider = new UrlWsdlSourceItemProvider(this);
        }

        return urlWsdlSourceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.FileSystemSource} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FileSystemSourceItemProvider fileSystemSourceItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.FileSystemSource}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFileSystemSourceAdapter()
    {
        if (fileSystemSourceItemProvider == null)
        {
            fileSystemSourceItemProvider = new FileSystemSourceItemProvider(this);
        }

        return fileSystemSourceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.ConnectionSettings} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectionSettingsItemProvider connectionSettingsItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.ConnectionSettings}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConnectionSettingsAdapter()
    {
        if (connectionSettingsItemProvider == null)
        {
            connectionSettingsItemProvider = new ConnectionSettingsItemProvider(this);
        }

        return connectionSettingsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.Subscription} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubscriptionItemProvider subscriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.Subscription}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSubscriptionAdapter()
    {
        if (subscriptionItemProvider == null)
        {
            subscriptionItemProvider = new SubscriptionItemProvider(this);
        }

        return subscriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.ReadRequestPoller} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReadRequestPollerItemProvider readRequestPollerItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.ReadRequestPoller}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createReadRequestPollerAdapter()
    {
        if (readRequestPollerItemProvider == null)
        {
            readRequestPollerItemProvider = new ReadRequestPollerItemProvider(this);
        }

        return readRequestPollerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.openscada.configuration.opcxml.ItemType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ItemTypeItemProvider itemTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.openscada.configuration.opcxml.ItemType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createItemTypeAdapter()
    {
        if (itemTypeItemProvider == null)
        {
            itemTypeItemProvider = new ItemTypeItemProvider(this);
        }

        return itemTypeItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory()
    {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
    {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type)
    {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type)
    {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type)
    {
        if (isFactoryForType(type))
        {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
            {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders()
    {
        return childCreationExtenderManager.getChildCreationExtenders();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain)
    {
        return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator()
    {
        return childCreationExtenderManager;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener)
    {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener)
    {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification)
    {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null)
        {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose()
    {
        if (opcXmlDeviceItemProvider != null) opcXmlDeviceItemProvider.dispose();
        if (opcXmlDriverItemProvider != null) opcXmlDriverItemProvider.dispose();
        if (driverApplicationItemProvider != null) driverApplicationItemProvider.dispose();
        if (hiveDeviceItemProvider != null) hiveDeviceItemProvider.dispose();
        if (urlWsdlSourceItemProvider != null) urlWsdlSourceItemProvider.dispose();
        if (fileSystemSourceItemProvider != null) fileSystemSourceItemProvider.dispose();
        if (connectionSettingsItemProvider != null) connectionSettingsItemProvider.dispose();
        if (subscriptionItemProvider != null) subscriptionItemProvider.dispose();
        if (readRequestPollerItemProvider != null) readRequestPollerItemProvider.dispose();
        if (itemTypeItemProvider != null) itemTypeItemProvider.dispose();
    }

    /**
     * A child creation extender for the {@link InfrastructurePackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class InfrastructureChildCreationExtender implements IChildCreationExtender
    {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends InfrastructureSwitch<Object>
        {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
            {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseNode(Node object)
            {
                newChildDescriptors.add
                    (createChildParameter
                        (InfrastructurePackage.Literals.NODE__DEVICES,
                         OpcxmlFactory.eINSTANCE.createOpcXmlDevice()));

                return null;
            }
 
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseSystemNode(SystemNode object)
            {
                newChildDescriptors.add
                    (createChildParameter
                        (InfrastructurePackage.Literals.SYSTEM_NODE__DRIVERS,
                         OpcxmlFactory.eINSTANCE.createOpcXmlDriver()));

                return null;
            }
 
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseConfigurations(Configurations object)
            {
                newChildDescriptors.add
                    (createChildParameter
                        (InfrastructurePackage.Literals.CONFIGURATIONS__SETTINGS,
                         OpcxmlFactory.eINSTANCE.createUrlWsdlSource()));

                newChildDescriptors.add
                    (createChildParameter
                        (InfrastructurePackage.Literals.CONFIGURATIONS__SETTINGS,
                         OpcxmlFactory.eINSTANCE.createFileSystemSource()));

                return null;
            }
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter(Object feature, Object child)
            {
                return new CommandParameter(null, feature, child);
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
        {
            ArrayList<Object> result = new ArrayList<Object>();
            new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResourceLocator getResourceLocator()
        {
            return OpcxmlEditPlugin.INSTANCE;
        }
    }

    /**
     * A child creation extender for the {@link WorldPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class WorldChildCreationExtender implements IChildCreationExtender
    {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends WorldSwitch<Object>
        {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
            {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseApplicationNode(ApplicationNode object)
            {
                newChildDescriptors.add
                    (createChildParameter
                        (WorldPackage.Literals.APPLICATION_NODE__APPLICATIONS,
                         OpcxmlFactory.eINSTANCE.createDriverApplication()));

                return null;
            }
 
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter(Object feature, Object child)
            {
                return new CommandParameter(null, feature, child);
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
        {
            ArrayList<Object> result = new ArrayList<Object>();
            new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResourceLocator getResourceLocator()
        {
            return OpcxmlEditPlugin.INSTANCE;
        }
    }

}