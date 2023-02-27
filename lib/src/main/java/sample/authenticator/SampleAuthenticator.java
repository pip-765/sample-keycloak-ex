package sample.authenticator;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.Authenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

import lombok.extern.jbosslog.JBossLog;

@JBossLog
public class SampleAuthenticator implements Authenticator {

	@Override
	public void authenticate(AuthenticationFlowContext context) {
		var user = context.getUser();
		log.infov("User: {0} {1}", user.getId(), user.getEmail());
		context.success();
	}
	
	@Override
	public void close() {
	}


	@Override
	public void action(AuthenticationFlowContext context) {
	}

	@Override
	public boolean requiresUser() {
		return true;
	}

	@Override
	public boolean configuredFor(KeycloakSession session, RealmModel realm, UserModel user) {
		return true;
	}

	@Override
	public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user) {
	}

}
