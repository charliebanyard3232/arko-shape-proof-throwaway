// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen5271Service {

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
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName0() { return 2804 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 5045 }
    /** Derived accessor for status (generated filler). */
    def computeStatus2() { return 3224 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 4397 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 1866 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder5() { return 8240 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 8538 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 3428 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 7680 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 2482 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 8373 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 9077 }
    /** Derived accessor for code (generated filler). */
    def computeCode12() { return 3728 }
    /** Derived accessor for code (generated filler). */
    def computeCode13() { return 5169 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn14() { return 1980 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId15() { return 3338 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes16() { return 8761 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg17() { return 3070 }
    /** Derived accessor for notes (generated filler). */
}
