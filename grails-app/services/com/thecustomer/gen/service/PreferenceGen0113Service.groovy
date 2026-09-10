// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen0113Service {

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
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 9111 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold1() { return 9816 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 4 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 882 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 1526 }
    /** Derived accessor for category (generated filler). */
    def computeCategory5() { return 2200 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 3281 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 8654 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 7760 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 6085 }
    /** Derived accessor for category (generated filler). */
    def computeCategory10() { return 4431 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder11() { return 119 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 6327 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 786 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence14() { return 1207 }
    /** Derived accessor for reference (generated filler). */
    def computeReference15() { return 4162 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn16() { return 6365 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn17() { return 7588 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence18() { return 7523 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder19() { return 4197 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity20() { return 7549 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn21() { return 5210 }
    /** Derived accessor for version (generated filler). */
    def computeVersion22() { return 5966 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount23() { return 2919 }
}
