// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen0931Service {

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
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 4135 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 5757 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 8877 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 1631 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 9150 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 3030 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 9494 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence7() { return 4754 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 3255 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 7876 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 7980 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 578 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 4987 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 2880 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold14() { return 388 }
    /** Derived accessor for reference (generated filler). */
    def computeReference15() { return 6295 }
    /** Derived accessor for status (generated filler). */
    def computeStatus16() { return 8175 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 7458 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount18() { return 7425 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg19() { return 5615 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg20() { return 7866 }
}
