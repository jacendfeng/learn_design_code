package com.jacend.trybaker;

import com.ing.baker.recipe.annotations.FiresEvent;
import com.ing.baker.recipe.annotations.ProcessId;

import javax.inject.Named;

/**
 * @author fengxf
 * @since 2019-03-06
 */
public interface ValidateOrder {

    interface Outcome {}

    class Failed implements Outcome {}

    class Valid implements Outcome {}

    @FiresEvent(oneOf = {Failed.class, Valid.class})
    Outcome apply(@ProcessId String processId,
                  @Named("order") String key);
}
