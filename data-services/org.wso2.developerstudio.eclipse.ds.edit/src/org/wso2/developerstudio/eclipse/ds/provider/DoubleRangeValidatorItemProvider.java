/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wso2.developerstudio.eclipse.ds.DoubleRangeValidator;
import org.wso2.developerstudio.eclipse.ds.DsPackage;

/**
 * This is the item provider adapter for a
 * {@link org.wso2.developerstudio.eclipse.ds.DoubleRangeValidator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DoubleRangeValidatorItemProvider extends ItemProviderAdapter
                                                                         implements
                                                                         IEditingDomainItemProvider,
                                                                         IStructuredItemContentProvider,
                                                                         ITreeItemContentProvider,
                                                                         IItemLabelProvider,
                                                                         IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleRangeValidatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMaximumPropertyDescriptor(object);
			addMinimumPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		                                                         getResourceLocator(),
		                                                         getString("_UI_DoubleRangeValidator_maximum_feature"),
		                                                         getString("_UI_PropertyDescriptor_description",
		                                                                   "_UI_DoubleRangeValidator_maximum_feature",
		                                                                   "_UI_DoubleRangeValidator_type"),
		                                                         DsPackage.Literals.DOUBLE_RANGE_VALIDATOR__MAXIMUM,
		                                                         true,
		                                                         false,
		                                                         false,
		                                                         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
		                                                         null, null));
	}

	/**
	 * This adds a property descriptor for the Minimum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMinimumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		                                                         getResourceLocator(),
		                                                         getString("_UI_DoubleRangeValidator_minimum_feature"),
		                                                         getString("_UI_PropertyDescriptor_description",
		                                                                   "_UI_DoubleRangeValidator_minimum_feature",
		                                                                   "_UI_DoubleRangeValidator_type"),
		                                                         DsPackage.Literals.DOUBLE_RANGE_VALIDATOR__MINIMUM,
		                                                         true,
		                                                         false,
		                                                         false,
		                                                         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
		                                                         null, null));
	}

	/**
	 * This returns DoubleRangeValidator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("wso2/validateDoubleRange"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	@Override
	public String getText(Object object) {
		DoubleRangeValidator doubleRangeValidator = (DoubleRangeValidator) object;
		return getString("_UI_DoubleRangeValidator_type") + " " + doubleRangeValidator.getMaximum();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached
	 * children and by creating a viewer notification, which it passes to
	 * {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DoubleRangeValidator.class)) {
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MAXIMUM:
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MINIMUM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
				                                         false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	@Override
	public ResourceLocator getResourceLocator() {
		return DsEditPlugin.INSTANCE;
	}

}