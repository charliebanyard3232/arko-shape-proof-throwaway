// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class OrderGen6565Service {

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
    def computePercentage0() { return 6062 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 5016 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 6094 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 1964 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 2432 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 7335 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 6431 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 7376 }
    /** Derived accessor for description (generated filler). */
    def computeDescription8() { return 4045 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 8333 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 180 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName11() { return 3196 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId12() { return 1607 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 73 }
    /** Derived accessor for createdOn (generated filler). */
}
