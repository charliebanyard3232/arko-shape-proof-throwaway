// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen2604Service {

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
    /** Derived accessor for code (generated filler). */
    def computeCode0() { return 7224 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 617 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 5567 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 3929 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 874 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 3875 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes6() { return 8338 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 845 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 5894 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 9872 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn10() { return 7685 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg11() { return 1703 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 5701 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity13() { return 9506 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName14() { return 6911 }
    /** Derived accessor for unitPrice (generated filler). */
}
