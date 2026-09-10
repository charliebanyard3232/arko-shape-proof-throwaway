// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen1835Service {

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
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 9673 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 161 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 7966 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 7724 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 1099 }
    /** Derived accessor for description (generated filler). */
    def computeDescription5() { return 1110 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 207 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 9221 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 8816 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 2893 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 6892 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 1025 }
}
