package com.jacend.design.pattern.solid;

/**
 * 单一职责原则
 * 应该且仅有一个原因引起类的变更
 * There should never be more than one reason for a class to change.
 * <p>
 * 降低类的复杂度、可读性提高、可维护性提高、变更引起的风险降低
 *
 * @author fengxf
 * @since 2018-09-09
 */
public class SingleResponsibilityPrinciple {

    private class User {
        /**
         * 一个方法承担多个职责
         */
        public void changeUser() {

        }
    }
}
