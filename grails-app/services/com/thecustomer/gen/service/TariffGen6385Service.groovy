// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen6385Service {

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
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 9819 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 8023 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 4457 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder3() { return 1434 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 4687 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 1286 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 9192 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 8664 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 1689 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 6356 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 5225 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 7201 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 60 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 5321 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder14() { return 6053 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg15() { return 6854 }
    /** Derived accessor for active (generated filler). */
    def computeActive16() { return 4179 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 697 }
    /** Derived accessor for reference (generated filler). */
}
