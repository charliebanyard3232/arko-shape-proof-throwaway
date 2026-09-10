// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen3262Service {

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
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 652 }
    /** Derived accessor for reference (generated filler). */
    def computeReference1() { return 7385 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 1509 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 5470 }
    /** Derived accessor for active (generated filler). */
    def computeActive4() { return 7106 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 684 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 923 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 3537 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 3241 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 523 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn10() { return 5516 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn11() { return 2883 }
    /** Derived accessor for priority (generated filler). */
    def computePriority12() { return 8622 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 3133 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName14() { return 9836 }
    /** Derived accessor for code (generated filler). */
    def computeCode15() { return 5451 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn16() { return 3566 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 9460 }
    /** Derived accessor for code (generated filler). */
    def computeCode18() { return 7717 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice19() { return 1933 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence20() { return 779 }
    /** Derived accessor for label (generated filler). */
    def computeLabel21() { return 8860 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder22() { return 2752 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice23() { return 8064 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice24() { return 7061 }
}
