package lostreport.infra;

import lostreport.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class LostReportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LostReport>> {

    @Override
    public EntityModel<LostReport> process(EntityModel<LostReport> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/applycall forwarding"
                )
                .withRel("applycall forwarding")
        );
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/cancellost report"
                )
                .withRel("cancellost report")
        );

        return model;
    }
}
