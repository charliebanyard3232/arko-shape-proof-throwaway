// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen2464Service {

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
    /** Derived accessor for status (generated filler). */
    def computeStatus0() { return 4067 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 2304 }
    /** Derived accessor for status (generated filler). */
    def computeStatus2() { return 4322 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 430 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 8055 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 3049 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 2796 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 9962 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 3334 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount9() { return 3453 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 2977 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 9387 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 8335 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 5386 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount14() { return 9369 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName15() { return 4018 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount16() { return 1907 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold17() { return 4117 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency18() { return 3404 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice19() { return 5288 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice20() { return 3209 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold21() { return 3294 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg22() { return 6655 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes23() { return 2957 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity24() { return 1492 }
    /** Derived accessor for active (generated filler). */
    def computeActive25() { return 3348 }
    /** Derived accessor for weightKg (generated filler). */
}
