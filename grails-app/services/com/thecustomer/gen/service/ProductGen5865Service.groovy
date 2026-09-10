// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen5865Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 2884 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 821 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 2794 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 6967 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 5605 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 6188 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 6660 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 9549 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 6759 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 6269 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 5253 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 1543 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 643 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 7387 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold14() { return 9926 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence15() { return 2942 }
    /** Derived accessor for quantity (generated filler). */
}
