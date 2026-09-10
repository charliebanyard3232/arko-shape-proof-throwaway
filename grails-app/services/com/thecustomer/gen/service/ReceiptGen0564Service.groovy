// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen0564Service {

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
    def computeCurrency0() { return 3861 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 7293 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 5844 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 3068 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 5783 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 3761 }
    /** Derived accessor for active (generated filler). */
    def computeActive6() { return 5576 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 8532 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg8() { return 4169 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 2939 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 1187 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn11() { return 4001 }
    /** Derived accessor for region (generated filler). */
    def computeRegion12() { return 6494 }
    /** Derived accessor for status (generated filler). */
}
