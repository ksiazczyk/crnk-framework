// ---docerion
// type: source
// title: SecurityProvider interface
// summary: Java interface defining methods to check whether a user is in a role and whether the user is authenticated within the security engine.
// ---

package io.crnk.core.engine.security;

public interface SecurityProvider {

    boolean isUserInRole(String role, SecurityProviderContext context);

    /**
     * @return true if the user has been logged in. If not, a {@link io.crnk.core.exception.UnauthorizedException} rather than
     * {@link io.crnk.core.exception.ForbiddenException} is  thrown.
     */
    boolean isAuthenticated(SecurityProviderContext context);
}
