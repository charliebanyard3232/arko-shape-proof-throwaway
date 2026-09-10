// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen3542Service {

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
    /** Derived accessor for percentage (generated filler). */
    def computePercentage0() { return 129 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 3282 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 7673 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 8320 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 1525 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes5() { return 8827 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 563 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 5528 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 1249 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 3047 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 3805 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 5585 }
    /** Derived accessor for reference (generated filler). */
}
