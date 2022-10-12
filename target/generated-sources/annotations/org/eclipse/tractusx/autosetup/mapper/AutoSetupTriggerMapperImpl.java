package org.eclipse.tractusx.autosetup.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.eclipse.tractusx.autosetup.constant.TriggerStatusEnum;
import org.eclipse.tractusx.autosetup.entity.AutoSetupTriggerDetails;
import org.eclipse.tractusx.autosetup.entity.AutoSetupTriggerEntry;
import org.eclipse.tractusx.autosetup.model.AutoSetupResponse;
import org.eclipse.tractusx.autosetup.model.AutoSetupTriggerResponse;
import org.eclipse.tractusx.autosetup.model.AutoSetupTriggerResponse.AutoSetupTriggerResponseBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-12T11:36:28+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class AutoSetupTriggerMapperImpl extends AutoSetupTriggerMapper {

    @Override
    public AutoSetupTriggerResponse fromEntity(AutoSetupTriggerEntry autoSetupTriggerEntry) {
        if ( autoSetupTriggerEntry == null ) {
            return null;
        }

        AutoSetupTriggerResponseBuilder autoSetupTriggerResponse = AutoSetupTriggerResponse.builder();

        autoSetupTriggerResponse.autosetupRequest( autoSetupTriggerEntry.getAutosetupRequest() );
        autoSetupTriggerResponse.autosetupResult( autoSetupTriggerEntry.getAutosetupResult() );
        List<AutoSetupTriggerDetails> list = autoSetupTriggerEntry.getAutosetupTriggerDetails();
        if ( list != null ) {
            autoSetupTriggerResponse.autosetupTriggerDetails( new ArrayList<AutoSetupTriggerDetails>( list ) );
        }
        autoSetupTriggerResponse.createdTimestamp( autoSetupTriggerEntry.getCreatedTimestamp() );
        autoSetupTriggerResponse.modifiedTimestamp( autoSetupTriggerEntry.getModifiedTimestamp() );
        autoSetupTriggerResponse.organizationName( autoSetupTriggerEntry.getOrganizationName() );
        autoSetupTriggerResponse.remark( autoSetupTriggerEntry.getRemark() );
        autoSetupTriggerResponse.status( autoSetupTriggerEntry.getStatus() );
        autoSetupTriggerResponse.triggerId( autoSetupTriggerEntry.getTriggerId() );
        autoSetupTriggerResponse.triggerType( autoSetupTriggerEntry.getTriggerType() );

        return autoSetupTriggerResponse.build();
    }

    @Override
    public AutoSetupResponse fromEntityforCustomResponse(AutoSetupTriggerEntry autoSetupTriggerEntry) {
        if ( autoSetupTriggerEntry == null ) {
            return null;
        }

        AutoSetupResponse autoSetupResponse = new AutoSetupResponse();

        autoSetupResponse.setCreatedTimestamp( autoSetupTriggerEntry.getCreatedTimestamp() );
        autoSetupResponse.setModifiedTimestamp( autoSetupTriggerEntry.getModifiedTimestamp() );
        autoSetupResponse.setRemark( autoSetupTriggerEntry.getRemark() );
        if ( autoSetupTriggerEntry.getStatus() != null ) {
            autoSetupResponse.setStatus( Enum.valueOf( TriggerStatusEnum.class, autoSetupTriggerEntry.getStatus() ) );
        }

        return autoSetupResponse;
    }
}
