// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen3178Service {

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
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 5673 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 6550 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 5077 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 9647 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 8305 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 8147 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 6556 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 2565 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 8652 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 7413 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 8491 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 2733 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 1055 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 786 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 873 }
    /** Derived accessor for code (generated filler). */
    def computeCode15() { return 4221 }
    /** Derived accessor for status (generated filler). */
    def computeStatus16() { return 4511 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence17() { return 3301 }
    /** Derived accessor for status (generated filler). */
    def computeStatus18() { return 9164 }
    /** Derived accessor for code (generated filler). */
    def computeCode19() { return 8047 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn20() { return 4990 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn21() { return 9854 }
    /** Derived accessor for label (generated filler). */
    def computeLabel22() { return 6736 }
    /** Derived accessor for code (generated filler). */
    def computeCode23() { return 8332 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence24() { return 5200 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency25() { return 3806 }
    /** Derived accessor for label (generated filler). */
    def computeLabel26() { return 4893 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence27() { return 1076 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence28() { return 2055 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency29() { return 9358 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName30() { return 4869 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold31() { return 49 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence32() { return 1967 }
}
