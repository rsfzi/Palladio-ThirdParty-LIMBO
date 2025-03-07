/**
 */
package tools.descartes.dlim.provider;

import java.util.ArrayList;
import java.util.Collection;

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

import tools.descartes.dlim.util.DlimAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class DlimItemProviderAdapterFactory extends DlimAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement
	 * {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public DlimItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.Sequence} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SequenceItemProvider sequenceItemProvider;

	/**
	 * This creates an adapter for a {@link tools.descartes.dlim.Sequence}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.Combinator} instances.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected CombinatorItemProvider combinatorItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.Combinator}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createCombinatorAdapter() {
        if (combinatorItemProvider == null) {
            combinatorItemProvider = new CombinatorItemProvider(this);
        }

        return combinatorItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.TimeDependentFunctionContainer} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected TimeDependentFunctionContainerItemProvider timeDependentFunctionContainerItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link tools.descartes.dlim.TimeDependentFunctionContainer}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTimeDependentFunctionContainerAdapter() {
        if (timeDependentFunctionContainerItemProvider == null) {
            timeDependentFunctionContainerItemProvider = new TimeDependentFunctionContainerItemProvider(this);
        }

        return timeDependentFunctionContainerItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.UniformNoise} instances.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected UniformNoiseItemProvider uniformNoiseItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.UniformNoise}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createUniformNoiseAdapter() {
        if (uniformNoiseItemProvider == null) {
            uniformNoiseItemProvider = new UniformNoiseItemProvider(this);
        }

        return uniformNoiseItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.NormalNoise} instances.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected NormalNoiseItemProvider normalNoiseItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.NormalNoise}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createNormalNoiseAdapter() {
        if (normalNoiseItemProvider == null) {
            normalNoiseItemProvider = new NormalNoiseItemProvider(this);
        }

        return normalNoiseItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.Constant} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link tools.descartes.dlim.Constant}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
        if (constantItemProvider == null) {
            constantItemProvider = new ConstantItemProvider(this);
        }

        return constantItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.Sin} instances.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	protected SinItemProvider sinItemProvider;

	/**
	 * This creates an adapter for a {@link tools.descartes.dlim.Sin}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createSinAdapter() {
        if (sinItemProvider == null) {
            sinItemProvider = new SinItemProvider(this);
        }

        return sinItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.ExponentialIncreaseAndDecline} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected ExponentialIncreaseAndDeclineItemProvider exponentialIncreaseAndDeclineItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link tools.descartes.dlim.ExponentialIncreaseAndDecline}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createExponentialIncreaseAndDeclineAdapter() {
        if (exponentialIncreaseAndDeclineItemProvider == null) {
            exponentialIncreaseAndDeclineItemProvider = new ExponentialIncreaseAndDeclineItemProvider(this);
        }

        return exponentialIncreaseAndDeclineItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.ExponentialIncreaseLogarithmicDecline} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected ExponentialIncreaseLogarithmicDeclineItemProvider exponentialIncreaseLogarithmicDeclineItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link tools.descartes.dlim.ExponentialIncreaseLogarithmicDecline}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createExponentialIncreaseLogarithmicDeclineAdapter() {
        if (exponentialIncreaseLogarithmicDeclineItemProvider == null) {
            exponentialIncreaseLogarithmicDeclineItemProvider = new ExponentialIncreaseLogarithmicDeclineItemProvider(this);
        }

        return exponentialIncreaseLogarithmicDeclineItemProvider;
    }

	/**
	 * This keeps track of the one adapter used for all
	 * {@link tools.descartes.dlim.LinearIncreaseAndDecline} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LinearIncreaseAndDeclineItemProvider linearIncreaseAndDeclineItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link tools.descartes.dlim.LinearIncreaseAndDecline}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createLinearIncreaseAndDeclineAdapter() {
        if (linearIncreaseAndDeclineItemProvider == null) {
            linearIncreaseAndDeclineItemProvider = new LinearIncreaseAndDeclineItemProvider(this);
        }

        return linearIncreaseAndDeclineItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.AbsoluteSin} instances.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected AbsoluteSinItemProvider absoluteSinItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.AbsoluteSin}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createAbsoluteSinAdapter() {
        if (absoluteSinItemProvider == null) {
            absoluteSinItemProvider = new AbsoluteSinItemProvider(this);
        }

        return absoluteSinItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.LinearTrend} instances.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected LinearTrendItemProvider linearTrendItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.LinearTrend}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createLinearTrendAdapter() {
        if (linearTrendItemProvider == null) {
            linearTrendItemProvider = new LinearTrendItemProvider(this);
        }

        return linearTrendItemProvider;
    }

	/**
	 * This keeps track of the one adapter used for all
	 * {@link tools.descartes.dlim.ExponentialTrend} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExponentialTrendItemProvider exponentialTrendItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.ExponentialTrend}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createExponentialTrendAdapter() {
        if (exponentialTrendItemProvider == null) {
            exponentialTrendItemProvider = new ExponentialTrendItemProvider(this);
        }

        return exponentialTrendItemProvider;
    }

	/**
	 * This keeps track of the one adapter used for all
	 * {@link tools.descartes.dlim.LogarithmicTrend} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogarithmicTrendItemProvider logarithmicTrendItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.LogarithmicTrend}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createLogarithmicTrendAdapter() {
        if (logarithmicTrendItemProvider == null) {
            logarithmicTrendItemProvider = new LogarithmicTrendItemProvider(this);
        }

        return logarithmicTrendItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.SinTrend} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SinTrendItemProvider sinTrendItemProvider;

	/**
	 * This creates an adapter for a {@link tools.descartes.dlim.SinTrend}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createSinTrendAdapter() {
        if (sinTrendItemProvider == null) {
            sinTrendItemProvider = new SinTrendItemProvider(this);
        }

        return sinTrendItemProvider;
    }

	/**
	 * This keeps track of the one adapter used for all
	 * {@link tools.descartes.dlim.ReferenceClockObject} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReferenceClockObjectItemProvider referenceClockObjectItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.ReferenceClockObject}.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createReferenceClockObjectAdapter() {
        if (referenceClockObjectItemProvider == null) {
            referenceClockObjectItemProvider = new ReferenceClockObjectItemProvider(this);
        }

        return referenceClockObjectItemProvider;
    }

	/**
	 * This keeps track of the one adapter used for all
	 * {@link tools.descartes.dlim.ArrivalRatesFromFile} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ArrivalRatesFromFileItemProvider arrivalRatesFromFileItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.ArrivalRatesFromFile}.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createArrivalRatesFromFileAdapter() {
        if (arrivalRatesFromFileItemProvider == null) {
            arrivalRatesFromFileItemProvider = new ArrivalRatesFromFileItemProvider(this);
        }

        return arrivalRatesFromFileItemProvider;
    }

	/**
	 * This keeps track of the one adapter used for all
	 * {@link tools.descartes.dlim.AbsoluteValueFunction} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AbsoluteValueFunctionItemProvider absoluteValueFunctionItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.AbsoluteValueFunction}.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createAbsoluteValueFunctionAdapter() {
        if (absoluteValueFunctionItemProvider == null) {
            absoluteValueFunctionItemProvider = new AbsoluteValueFunctionItemProvider(this);
        }

        return absoluteValueFunctionItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link tools.descartes.dlim.Polynomial} instances.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected PolynomialItemProvider polynomialItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.Polynomial}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createPolynomialAdapter() {
        if (polynomialItemProvider == null) {
            polynomialItemProvider = new PolynomialItemProvider(this);
        }

        return polynomialItemProvider;
    }

	/**
	 * This keeps track of the one adapter used for all
	 * {@link tools.descartes.dlim.PolynomialFactor} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PolynomialFactorItemProvider polynomialFactorItemProvider;

	/**
     * This creates an adapter for a {@link tools.descartes.dlim.PolynomialFactor}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createPolynomialFactorAdapter() {
        if (polynomialFactorItemProvider == null) {
            polynomialFactorItemProvider = new PolynomialFactorItemProvider(this);
        }

        return polynomialFactorItemProvider;
    }

	/**
	 * This returns the root adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

	/**
	 * This sets the composed adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
    public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

	/**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

	/**
     * This adds a listener.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

	/**
     * This removes a listener.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

	/**
	 * This delegates to {@link #changeNotifier} and to
	 * {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

	/**
	 * This disposes all of the item providers created by this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
    public void dispose() {
        if (sequenceItemProvider != null) sequenceItemProvider.dispose();
        if (combinatorItemProvider != null) combinatorItemProvider.dispose();
        if (timeDependentFunctionContainerItemProvider != null) timeDependentFunctionContainerItemProvider.dispose();
        if (uniformNoiseItemProvider != null) uniformNoiseItemProvider.dispose();
        if (normalNoiseItemProvider != null) normalNoiseItemProvider.dispose();
        if (constantItemProvider != null) constantItemProvider.dispose();
        if (sinItemProvider != null) sinItemProvider.dispose();
        if (exponentialIncreaseAndDeclineItemProvider != null) exponentialIncreaseAndDeclineItemProvider.dispose();
        if (exponentialIncreaseLogarithmicDeclineItemProvider != null) exponentialIncreaseLogarithmicDeclineItemProvider.dispose();
        if (linearIncreaseAndDeclineItemProvider != null) linearIncreaseAndDeclineItemProvider.dispose();
        if (absoluteSinItemProvider != null) absoluteSinItemProvider.dispose();
        if (linearTrendItemProvider != null) linearTrendItemProvider.dispose();
        if (exponentialTrendItemProvider != null) exponentialTrendItemProvider.dispose();
        if (logarithmicTrendItemProvider != null) logarithmicTrendItemProvider.dispose();
        if (sinTrendItemProvider != null) sinTrendItemProvider.dispose();
        if (referenceClockObjectItemProvider != null) referenceClockObjectItemProvider.dispose();
        if (arrivalRatesFromFileItemProvider != null) arrivalRatesFromFileItemProvider.dispose();
        if (absoluteValueFunctionItemProvider != null) absoluteValueFunctionItemProvider.dispose();
        if (polynomialItemProvider != null) polynomialItemProvider.dispose();
        if (polynomialFactorItemProvider != null) polynomialFactorItemProvider.dispose();
    }

}
