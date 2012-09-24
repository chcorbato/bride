/**
 * Copyright (c) 2011 Katholieke Universiteit Leuven
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 
 *     Hugo A. Garica - initial API and implementation
 * and/or initial documentation.
 * 
 *     Herman Bruyninckx - Supervisor.
 */
package org.best_of_robotics.model.Cpf.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.best_of_robotics.model.Cpf.util.CpfAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CpfItemProviderAdapterFactory extends CpfAdapterFactory implements
		ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public CpfItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Choice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceItemProvider choiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceAdapter() {
		if (choiceItemProvider == null) {
			choiceItemProvider = new ChoiceItemProvider(this);
		}

		return choiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Choices} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoicesItemProvider choicesItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Choices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoicesAdapter() {
		if (choicesItemProvider == null) {
			choicesItemProvider = new ChoicesItemProvider(this);
		}

		return choicesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Defaultvalue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultvalueItemProvider defaultvalueItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Defaultvalue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultvalueAdapter() {
		if (defaultvalueItemProvider == null) {
			defaultvalueItemProvider = new DefaultvalueItemProvider(this);
		}

		return defaultvalueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Description} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionItemProvider descriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Description}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptionAdapter() {
		if (descriptionItemProvider == null) {
			descriptionItemProvider = new DescriptionItemProvider(this);
		}

		return descriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Properties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesItemProvider propertiesItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Properties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertiesAdapter() {
		if (propertiesItemProvider == null) {
			propertiesItemProvider = new PropertiesItemProvider(this);
		}

		return propertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Sequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceItemProvider sequenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceAdapter() {
		if (sequenceItemProvider == null) {
			sequenceItemProvider = new SequenceItemProvider(this);
		}

		return sequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Simple} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleItemProvider simpleItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Simple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleAdapter() {
		if (simpleItemProvider == null) {
			simpleItemProvider = new SimpleItemProvider(this);
		}

		return simpleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Struct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructItemProvider structItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Struct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructAdapter() {
		if (structItemProvider == null) {
			structItemProvider = new StructItemProvider(this);
		}

		return structItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.Cpf.Value} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueItemProvider valueItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.Cpf.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueAdapter() {
		if (valueItemProvider == null) {
			valueItemProvider = new ValueItemProvider(this);
		}

		return valueItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (choiceItemProvider != null)
			choiceItemProvider.dispose();
		if (choicesItemProvider != null)
			choicesItemProvider.dispose();
		if (defaultvalueItemProvider != null)
			defaultvalueItemProvider.dispose();
		if (descriptionItemProvider != null)
			descriptionItemProvider.dispose();
		if (documentRootItemProvider != null)
			documentRootItemProvider.dispose();
		if (propertiesItemProvider != null)
			propertiesItemProvider.dispose();
		if (sequenceItemProvider != null)
			sequenceItemProvider.dispose();
		if (simpleItemProvider != null)
			simpleItemProvider.dispose();
		if (structItemProvider != null)
			structItemProvider.dispose();
		if (valueItemProvider != null)
			valueItemProvider.dispose();
	}

}