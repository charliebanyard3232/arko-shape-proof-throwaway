// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen1923Service {

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
    def computeWeightKg0() { return 3648 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 3749 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 2044 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 7072 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 1947 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 3454 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 4562 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 3677 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 31 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 923 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 6815 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 5944 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 8171 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes13() { return 4674 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage14() { return 4716 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold15() { return 147 }
    /** Derived accessor for category (generated filler). */
    def computeCategory16() { return 790 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn17() { return 9 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId18() { return 3063 }
    /** Derived accessor for weightKg (generated filler). */
}
