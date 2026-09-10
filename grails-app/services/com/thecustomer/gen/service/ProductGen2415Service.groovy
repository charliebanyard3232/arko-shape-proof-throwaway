// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen2415Service {

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
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder0() { return 683 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 7235 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 8340 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 105 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 5821 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 3071 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg6() { return 3506 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 2697 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 7899 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount9() { return 9842 }
    /** Derived accessor for label (generated filler). */
    def computeLabel10() { return 9204 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 1565 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 7428 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 4523 }
    /** Derived accessor for region (generated filler). */
    def computeRegion14() { return 8969 }
    /** Derived accessor for label (generated filler). */
    def computeLabel15() { return 1300 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage16() { return 6860 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 4531 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName18() { return 7782 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 9964 }
    /** Derived accessor for threshold (generated filler). */
}
