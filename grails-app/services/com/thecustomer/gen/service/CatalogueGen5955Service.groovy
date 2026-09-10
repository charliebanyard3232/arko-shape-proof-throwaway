// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class CatalogueGen5955Service {

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
    def computeWeightKg0() { return 5904 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 7636 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 3775 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 8731 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 3924 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 3345 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 6824 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 5905 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 3671 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 3027 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 686 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 555 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 8969 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 8205 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName14() { return 228 }
}
