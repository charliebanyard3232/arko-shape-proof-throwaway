// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen5319Service {

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
    def computeStatus0() { return 6033 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 4005 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 8666 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 4757 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 8078 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 3547 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 2142 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 1564 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes8() { return 3755 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 6640 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder10() { return 4301 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 2469 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 2696 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName13() { return 8610 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency14() { return 4419 }
    /** Derived accessor for label (generated filler). */
    def computeLabel15() { return 1869 }
}
