package com.acme.plugins.cooltek;

import com.vmware.o11n.plugin.sdk.module.ModuleBuilder;
import com.acme.plugins.cooltek.model.CooltekGreeter;

public final class CooltekModuleBuilder extends ModuleBuilder {

    private static final String DESCRIPTION = "Acme's Cooltek Adatper for vCO plug-in for vCenter Orchestrator";

    private static final String DATASOURCE = "main-datasource";

    @Override
    public void configure() {
        module("Cooltek").withDescription(DESCRIPTION).withImage("images/default-16x16.png")
                .basePackages(CooltekModuleBuilder.class.getPackage().getName()).version(
                "${project.version}");

        installation(InstallationMode.BUILD).action(ActionType.INSTALL_PACKAGE,
                "packages/${project.artifactId}-package-${project.version}.package");

        finderDatasource(CooltekPluginAdaptor.class, DATASOURCE).anonymousLogin(LoginMode.INTERNAL);
    }
}
