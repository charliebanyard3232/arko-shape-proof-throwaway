// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen5989Service {

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
    /** Derived accessor for sequence (generated filler). */
    def computeSequence0() { return 3106 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 6437 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 2937 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 8884 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 4535 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 5133 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 7697 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 4801 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 8101 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice9() { return 4201 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 4605 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 986 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 5858 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold13() { return 2848 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency14() { return 251 }
    /** Derived accessor for label (generated filler). */
    def computeLabel15() { return 2965 }
    /** Derived accessor for active (generated filler). */
    def computeActive16() { return 3593 }
    /** Derived accessor for description (generated filler). */
    def computeDescription17() { return 569 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold18() { return 6720 }
    /** Derived accessor for region (generated filler). */
    def computeRegion19() { return 1666 }
    /** Derived accessor for priority (generated filler). */
    def computePriority20() { return 7684 }
    /** Derived accessor for priority (generated filler). */
    def computePriority21() { return 896 }
    /** Derived accessor for code (generated filler). */
    def computeCode22() { return 4790 }
    /** Derived accessor for priority (generated filler). */
    def computePriority23() { return 5927 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold24() { return 4030 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder25() { return 2160 }
}
