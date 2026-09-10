// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen2961Service {

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
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 6759 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 9180 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 1688 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 9603 }
    /** Derived accessor for description (generated filler). */
    def computeDescription4() { return 4131 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 4106 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 8518 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 1519 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes8() { return 8247 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 630 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 742 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 2749 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 7600 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 8187 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName14() { return 831 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold15() { return 6144 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage16() { return 9027 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold17() { return 8528 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 8331 }
    /** Derived accessor for version (generated filler). */
    def computeVersion19() { return 3128 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice20() { return 7475 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName21() { return 8545 }
    /** Derived accessor for region (generated filler). */
    def computeRegion22() { return 9425 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount23() { return 7583 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity24() { return 2922 }
    /** Derived accessor for version (generated filler). */
    def computeVersion25() { return 3315 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency26() { return 1723 }
    /** Derived accessor for version (generated filler). */
}
