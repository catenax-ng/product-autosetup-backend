package org.eclipse.tractusx.autosetup.mapper;

import javax.annotation.processing.Generated;
import org.eclipse.tractusx.autosetup.entity.AppDetails;
import org.eclipse.tractusx.autosetup.entity.AppDetails.AppDetailsBuilder;
import org.eclipse.tractusx.autosetup.model.AppDetailsRequest;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-12T11:36:28+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class AppDetailsMapperImpl implements AppDetailsMapper {

    @Override
    public AppDetails from(AppDetailsRequest appDetailsRequest) {
        if ( appDetailsRequest == null ) {
            return null;
        }

        AppDetailsBuilder appDetails = AppDetails.builder();

        appDetails.appName( appDetailsRequest.getAppName() );
        appDetails.contextCluster( appDetailsRequest.getContextCluster() );
        appDetails.contextNamespace( appDetailsRequest.getContextNamespace() );
        appDetails.expectedInputData( appDetailsRequest.getExpectedInputData() );
        appDetails.outputData( appDetailsRequest.getOutputData() );
        appDetails.packageIdentifier( appDetailsRequest.getPackageIdentifier() );
        appDetails.packageVersion( appDetailsRequest.getPackageVersion() );
        appDetails.pluginName( appDetailsRequest.getPluginName() );
        appDetails.pluginVersion( appDetailsRequest.getPluginVersion() );
        appDetails.requiredYamlConfiguration( appDetailsRequest.getRequiredYamlConfiguration() );
        appDetails.yamlValueFieldType( appDetailsRequest.getYamlValueFieldType() );

        return appDetails.build();
    }
}
