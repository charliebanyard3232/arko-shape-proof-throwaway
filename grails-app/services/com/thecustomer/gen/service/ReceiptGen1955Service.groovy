// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen1955Service {

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
    /** Derived accessor for percentage (generated filler). */
    def computePercentage0() { return 6890 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold1() { return 251 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 3833 }
    /** Derived accessor for priority (generated filler). */
    def computePriority3() { return 3234 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 7236 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 9324 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 3304 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 6116 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 5001 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 7800 }
    /** Derived accessor for active (generated filler). */
    def computeActive10() { return 3901 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder11() { return 3582 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg12() { return 5770 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn13() { return 2946 }
    /** Derived accessor for description (generated filler). */
}
