package sample.authenticator;

import java.util.Collections;
import java.util.List;

import org.keycloak.Config.Scope;
import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel.Requirement;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;

public class SampleAuthenticatorFactory implements AuthenticatorFactory {
	private static final SampleAuthenticator instance = new SampleAuthenticator();

	@Override
	public Authenticator create(KeycloakSession session) {
		return instance;
	}

	@Override
	public void init(Scope config) {
	}

	@Override
	public void postInit(KeycloakSessionFactory factory) {
	}

	@Override
	public void close() {
	}

	@Override
	public String getId() {
		return "x-sample-auth";
	}

	@Override
	public String getDisplayType() {
		return "Sample Authenticator";
	}

	@Override
	public String getReferenceCategory() {
		return null;
	}

	@Override
	public boolean isConfigurable() {
		return false;
	}

	@Override
	public Requirement[] getRequirementChoices() {
		return new Requirement[] {
				Requirement.REQUIRED,
				Requirement.ALTERNATIVE,
				Requirement.DISABLED
		};
	}

	@Override
	public boolean isUserSetupAllowed() {
		return false;
	}

	@Override
	public String getHelpText() {
		return "";
	}

	@Override
	public List<ProviderConfigProperty> getConfigProperties() {
		return Collections.emptyList();
	}

}
