// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen5625Service {

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
    /** Derived accessor for reference (generated filler). */
    def computeReference0() { return 356 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 5825 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 6192 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName3() { return 3995 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 6902 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 3235 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 7736 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 5237 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 6909 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 8807 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 9266 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 2681 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency12() { return 6040 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 2877 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName14() { return 3908 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes15() { return 6757 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes16() { return 7563 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName17() { return 6716 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn18() { return 5456 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice19() { return 4659 }
    /** Derived accessor for label (generated filler). */
    def computeLabel20() { return 6181 }
    /** Derived accessor for priority (generated filler). */
    def computePriority21() { return 6964 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes22() { return 8544 }
    /** Derived accessor for category (generated filler). */
    def computeCategory23() { return 6814 }
    /** Derived accessor for status (generated filler). */
    def computeStatus24() { return 6328 }
    /** Derived accessor for priority (generated filler). */
    def computePriority25() { return 8434 }
    /** Derived accessor for label (generated filler). */
    def computeLabel26() { return 1175 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId27() { return 9840 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId28() { return 5388 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn29() { return 3681 }
    /** Derived accessor for version (generated filler). */
    def computeVersion30() { return 5379 }
}
