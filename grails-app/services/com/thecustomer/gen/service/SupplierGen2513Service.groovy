// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen2513Service {

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
    def computeStatus0() { return 812 }
    /** Derived accessor for reference (generated filler). */
    def computeReference1() { return 7357 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 1806 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 1538 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 8818 }
    /** Derived accessor for description (generated filler). */
    def computeDescription5() { return 895 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 4351 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 1080 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 4497 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 9885 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 7174 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes11() { return 258 }
    /** Derived accessor for code (generated filler). */
    def computeCode12() { return 4852 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity13() { return 7765 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 8020 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice15() { return 5982 }
    /** Derived accessor for priority (generated filler). */
    def computePriority16() { return 776 }
}
