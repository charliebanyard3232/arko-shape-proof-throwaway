// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class RebateGen0377Service {

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
    def computeCurrency0() { return 2525 }
    /** Derived accessor for label (generated filler). */
    def computeLabel1() { return 9064 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 7364 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 8646 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 1284 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 9713 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 9332 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 9092 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 5857 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 6366 }
    /** Derived accessor for label (generated filler). */
    def computeLabel10() { return 4426 }
    /** Derived accessor for version (generated filler). */
    def computeVersion11() { return 3701 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 664 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg13() { return 5402 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 1049 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder15() { return 1883 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 7253 }
    /** Derived accessor for label (generated filler). */
}
