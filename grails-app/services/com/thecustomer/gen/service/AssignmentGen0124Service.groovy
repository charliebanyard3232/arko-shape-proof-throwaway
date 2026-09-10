// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class AssignmentGen0124Service {

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
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName0() { return 3414 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 7387 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 4883 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 701 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 4193 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 4297 }
    /** Derived accessor for active (generated filler). */
    def computeActive6() { return 6844 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 471 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 8986 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 2940 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 5105 }
    /** Derived accessor for code (generated filler). */
    def computeCode11() { return 4969 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 6257 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 2374 }
    /** Derived accessor for category (generated filler). */
    def computeCategory14() { return 6832 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg15() { return 9158 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold16() { return 3617 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder17() { return 6048 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn18() { return 438 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount19() { return 1260 }
}
