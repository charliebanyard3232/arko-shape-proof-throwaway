// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen4662Service {

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
    def computeStatus0() { return 8014 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 4433 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 2576 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 7578 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 6299 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity5() { return 1519 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 7009 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence7() { return 2297 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 6949 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 9926 }
    /** Derived accessor for category (generated filler). */
    def computeCategory10() { return 1814 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 4407 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 2117 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 901 }
    /** Derived accessor for notes (generated filler). */
}
