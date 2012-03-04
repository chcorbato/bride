package org.ros.model.ros.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.diagram.edit.parts.NodeEditPart;
import org.ros.model.ros.diagram.edit.parts.PackageEditPart;
import org.ros.model.ros.diagram.edit.parts.ParameterEditPart;
import org.ros.model.ros.diagram.edit.parts.PublisherEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceClientEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceServerEditPart;
import org.ros.model.ros.diagram.edit.parts.SubscriberEditPart;
import org.ros.model.ros.diagram.edit.parts.TopicEditPart;
import org.ros.model.ros.diagram.part.RosDiagramEditorPlugin;

/**
 * @generated
 */
public class RosElementTypes {

	/**
	 * @generated
	 */
	private RosElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("org.ros.model.ros.diagram.Package_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2001 = getElementType("org.ros.model.ros.diagram.Node_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Topic_2002 = getElementType("org.ros.model.ros.diagram.Topic_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Service_2003 = getElementType("org.ros.model.ros.diagram.Service_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Parameter_3001 = getElementType("org.ros.model.ros.diagram.Parameter_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceClient_4001 = getElementType("org.ros.model.ros.diagram.ServiceClient_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Subscriber_4002 = getElementType("org.ros.model.ros.diagram.Subscriber_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceServer_4003 = getElementType("org.ros.model.ros.diagram.ServiceServer_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Publisher_4004 = getElementType("org.ros.model.ros.diagram.Publisher_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return RosDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Package_1000, RosPackage.eINSTANCE.getPackage());

			elements.put(Node_2001, RosPackage.eINSTANCE.getNode());

			elements.put(Topic_2002, RosPackage.eINSTANCE.getTopic());

			elements.put(Service_2003, RosPackage.eINSTANCE.getService());

			elements.put(Parameter_3001, RosPackage.eINSTANCE.getParameter());

			elements.put(ServiceClient_4001,
					RosPackage.eINSTANCE.getServiceClient());

			elements.put(Subscriber_4002, RosPackage.eINSTANCE.getSubscriber());

			elements.put(ServiceServer_4003,
					RosPackage.eINSTANCE.getServiceServer());

			elements.put(Publisher_4004, RosPackage.eINSTANCE.getPublisher());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(Node_2001);
			KNOWN_ELEMENT_TYPES.add(Topic_2002);
			KNOWN_ELEMENT_TYPES.add(Service_2003);
			KNOWN_ELEMENT_TYPES.add(Parameter_3001);
			KNOWN_ELEMENT_TYPES.add(ServiceClient_4001);
			KNOWN_ELEMENT_TYPES.add(Subscriber_4002);
			KNOWN_ELEMENT_TYPES.add(ServiceServer_4003);
			KNOWN_ELEMENT_TYPES.add(Publisher_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PackageEditPart.VISUAL_ID:
			return Package_1000;
		case NodeEditPart.VISUAL_ID:
			return Node_2001;
		case TopicEditPart.VISUAL_ID:
			return Topic_2002;
		case ServiceEditPart.VISUAL_ID:
			return Service_2003;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_3001;
		case ServiceClientEditPart.VISUAL_ID:
			return ServiceClient_4001;
		case SubscriberEditPart.VISUAL_ID:
			return Subscriber_4002;
		case ServiceServerEditPart.VISUAL_ID:
			return ServiceServer_4003;
		case PublisherEditPart.VISUAL_ID:
			return Publisher_4004;
		}
		return null;
	}

}