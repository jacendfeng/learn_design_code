package com.jacend.trybaker;

import akka.actor.ActorSystem;
import com.ing.baker.recipe.javadsl.Recipe;
import com.ing.baker.runtime.java_api.JBaker;


/**
 * @author fengxf
 * @since 2019-03-06
 */
public class Test {

    public static void main(String[] args) {
        ActorSystem actorSystem = ActorSystem.create();
        JBaker jBaker = new JBaker(actorSystem);
    }
}
