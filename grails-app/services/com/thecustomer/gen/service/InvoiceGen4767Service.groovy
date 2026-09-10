// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen4767Service {

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
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 9070 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 588 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 4905 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 6379 }
    /** Derived accessor for label (generated filler). */
    def computeLabel4() { return 2837 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 4156 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 8364 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 9729 }
    /** Derived accessor for description (generated filler). */
    def computeDescription8() { return 842 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 9167 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 6914 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 4172 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity12() { return 9606 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 6722 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes14() { return 6390 }
    /** Derived accessor for active (generated filler). */
}
