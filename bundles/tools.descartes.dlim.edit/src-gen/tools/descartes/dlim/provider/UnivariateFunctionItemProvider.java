/**
 */
package tools.descartes.dlim.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import tools.descartes.dlim.DlimFactory;
import tools.descartes.dlim.DlimPackage;
import tools.descartes.dlim.UnivariateFunction;

/**
 * This is the item provider adapter for a {@link tools.descartes.dlim.UnivariateFunction} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class UnivariateFunctionItemProvider extends FunctionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnivariateFunctionItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

	/**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION);
        }
        return childrenFeatures;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        return getString("_UI_UnivariateFunction_type");
    }

	/**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	@Override
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(UnivariateFunction.class)) {
            case DlimPackage.UNIVARIATE_FUNCTION__FUNCTION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createSequence()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createUniformNoise()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createNormalNoise()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createConstant()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createSin()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createExponentialIncreaseAndDecline()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createExponentialIncreaseLogarithmicDecline()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createLinearIncreaseAndDecline()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createAbsoluteSin()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createLinearTrend()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createExponentialTrend()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createLogarithmicTrend()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createSinTrend()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createArrivalRatesFromFile()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createAbsoluteValueFunction()));

        newChildDescriptors.add
            (createChildParameter
                (DlimPackage.Literals.UNIVARIATE_FUNCTION__FUNCTION,
                 DlimFactory.eINSTANCE.createPolynomial()));
    }

}
