// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen3892Service {

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
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 2252 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn1() { return 7381 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 5518 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 5332 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 8666 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 8884 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes6() { return 398 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 1258 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 6798 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 1128 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn10() { return 3154 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 8980 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 3276 }
    /** Derived accessor for code (generated filler). */
    def computeCode13() { return 8764 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg14() { return 1342 }
}
