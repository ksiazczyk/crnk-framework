// ---docerion
// type: source
// title: UnkonwnMappingAware
// summary: Interface tracking whether unknown attributes and parameters are allowed during mapping.
// ---

package io.crnk.core.queryspec.mapper;

public interface UnkonwnMappingAware {

	boolean getAllowUnknownAttributes();

	void setAllowUnknownAttributes(boolean allowUnknownAttributes);

	boolean isAllowUnknownParameters();

	void setAllowUnknownParameters(final boolean allowUnknownParameters);

}
