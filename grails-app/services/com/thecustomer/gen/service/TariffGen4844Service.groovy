// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen4844Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 4434 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 7460 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 3428 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder3() { return 5767 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 7975 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 3780 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 6905 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 1649 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 7257 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 3051 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 4790 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName11() { return 8481 }
}
