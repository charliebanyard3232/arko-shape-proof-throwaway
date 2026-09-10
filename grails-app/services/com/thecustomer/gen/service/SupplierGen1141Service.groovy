// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen1141Service {

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
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 7907 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 816 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 8986 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 4022 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 4846 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 590 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 4999 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 1328 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 5266 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 731 }
    /** Derived accessor for category (generated filler). */
    def computeCategory10() { return 8433 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 2147 }
    /** Derived accessor for version (generated filler). */
    def computeVersion12() { return 4408 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName13() { return 700 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 8250 }
}
